#include <Python.h>
#include <string>
#include "HiveParserModule.h"

PyObject* py_parse(PyObject* self, PyObject* args)
{
    char * input = PyBytes_AsString(PyUnicode_AsUTF8String(args));

    std::string in(input);
    std::string result = parse(in);

    return PyBytes_FromString(result.c_str());
}

static PyMethodDef ModuleMethods[] = {
    {"parse", (PyCFunction)py_parse, METH_O, "Parse Hive QL"},
    { nullptr, nullptr, 0, nullptr}
};


static struct PyModuleDef hiveparsermodule = {
    PyModuleDef_HEAD_INIT,
    "hiveparser", /* name of module */
    "Hive QL Parser", /* Doc string (may be NULL) */
    0, /* Size of per-interpreter state or -1 */
    ModuleMethods /* Method table */
};

/* Module initialization function */
PyMODINIT_FUNC PyInit_hiveparser(void) {
    return PyModule_Create(&hiveparsermodule);
}