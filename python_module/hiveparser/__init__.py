import sys
import pathlib

sys.path.append(str(pathlib.Path(__file__).parent.absolute()))
import hiveparser_c

del pathlib
del sys

def parse(str_in):


    if type(str_in) is not str:
        import _io
        if(type(str_in) == _io.TextIOWrapper):
            str_in = str_in.read()        
        else:
            raise TypeError("Input must be str, TextIOWrapper type")
    else:        
        import os.path
        if(os.path.isfile(str_in)):
            arq_open = open(str_in)
            str_in = arq_open.read()

    import json
    try:
        result = json.loads(hiveparser_c.parse(str_in))
        return result['stmt_list']
    except Exception as ex:
        print(ex)
        return dict()
#python setup.py sdist bdist_wheel