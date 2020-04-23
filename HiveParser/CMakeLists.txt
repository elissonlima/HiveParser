# minimum required CMAKE version
CMAKE_MINIMUM_REQUIRED(VERSION 3.7 FATAL_ERROR)

find_program(PYTHON "python")

list(APPEND CMAKE_MODULE_PATH ${CMAKE_CURRENT_SOURCE_DIR}/cmake)

# compiler must be 11 or 14
set(CMAKE_CXX_STANDARD 11)

# required if linking to static library
add_definitions(-DANTLR4CPP_STATIC)

# using /MD flag for antlr4_runtime (for Visual C++ compilers only)
set(ANTLR4_WITH_STATIC_CRT OFF)
# add external build for antlrcpp
include(ExternalAntlr4Cpp)
# add antrl4cpp artifacts to project environment
include_directories(${ANTLR4_INCLUDE_DIRS})

# find_package(antlr4-runtime REQUIRED)
# find_package(antlr4-generator REQUIRED)

# add macros to generate ANTLR Cpp code from grammar
set(ANTLR_EXECUTABLE C:/antlr/antlr-4.8-complete.jar)
find_package(ANTLR REQUIRED)

add_subdirectory("third_part")

# set variable pointing to the antlr tool that supports C++
# this is not required if the jar file can be found under PATH environment

# Call macro to add lexer and grammar to your build dependencies.
# antlr_target(HiveLexer grammar/HiveLex.g4 LEXER
#             PACKAGE hiveparser)

include_directories(${CMAKE_CURRENT_SOURCE_DIR})
antlr_target(HiveParser grammar/Hive.g4 BOTH
             PACKAGE hiveparser)
#             COMPILE_FLAGS -lib ${ANTLR_HiveLexer_OUTPUT_DIR})


include_directories(${ANTLR_HiveParser_OUTPUT_DIR})
get_filename_component(ANTLR4_LIB_DIR ${ANTLR4_RUNTIME_LIBRARIES} DIRECTORY)
include_directories(${ANTLR4_INCLUDE_DIRS})
include_directories(${ANTLR4_RUNTIME_LIBRARIES})

message("Lexer out dir ${ANTLR_HiveLexer_OUTPUT_DIR}")
message("Parser out dir ${ANTLR_HiveParser_OUTPUT_DIR}")

add_executable(hiveparser main.cpp hql_types.cpp hql_exprs.cpp hql_stmts.cpp hql_functions.cpp
#               ${ANTLR_HiveLexer_CXX_OUTPUTS}
               ${ANTLR_HiveParser_CXX_OUTPUTS})

target_link_libraries(hiveparser PRIVATE antlr4_static PRIVATE nlohmann_json::nlohmann_json)
# target_link_libraries(hiveparser antlr4_shared)
#add_custom_command(TARGET hiveparser
#                   POST_BUILD
#                   COMMAND ${CMAKE_COMMAND}
#                           -E copy ${ANTLR4_RUNTIME_LIBRARIES} .
#                   WORKING_DIRECTORY ${CMAKE_CURRENT_BINARY_DIR})

#set(SETUP_PY_IN "${CMAKE_CURRENT_SOURCE_DIR}/setup.py.in")
#set(SETUP_PY    "${CMAKE_CURRENT_BINARY_DIR}/HiveParser/setup.py")
#    set(DEPS        "${CMAKE_CURRENT_SOURCE_DIR}/module/__init__.py")
#set(OUTPUT      "${CMAKE_CURRENT_BINARY_DIR}/build_ext")

#configure_file(${SETUP_PY_IN} ${SETUP_PY})

#add_custom_command(OUTPUT ${OUTPUT}
#                    COMMAND ${PYTHON} ${SETUP_PY} build_ext
#                    COMMAND ${CMAKE_COMMAND} -E touch ${OUTPUT} 
#                    DEPENDS ${DEPS})

#add_custom_target(target ALL DEPENDS ${OUTPUT})

#install(CODE "execute_process(COMMAND ${PYTHON} ${SETUP_PY} install)")