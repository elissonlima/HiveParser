# CMakeList.txt : Top-level CMake project file, do global configuration
# and include sub-projects here.
#
cmake_minimum_required (VERSION 3.8)

project ("HiveParser")

set(BASE_PROJECT_PATH ${CMAKE_CURRENT_SOURCE_DIR} CACHE INTERNAL "")

# Include sub-projects.
add_subdirectory ("HiveParser")