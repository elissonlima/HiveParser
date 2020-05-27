import sys
import pathlib
from _io import TextIOWrapper

sys.path.append(str(pathlib.Path(__file__).parent.absolute()))
import hiveparser_c

del pathlib
del sys

def check_types(f):
    def new_f(*args, **kwargs):
        if ( type(args[0]) != str and 
             type(args[0]) != TextIOWrapper):
            raise TypeError("{}: input should be string or _io.TextIOWrapper"
                    .format(f.__name__))

        if ( 'replace' in kwargs and 
            type(kwargs['replace']) != list
            and type(kwargs['replace']) != tuple):
            raise TypeError("{}: replace value should be list or tuple"
                    .format(f.__name__))
        elif ( 'replace' in kwargs and 
                len(kwargs['replace']) > 0 and
                type(kwargs['replace'][0]) != tuple and
                type(kwargs['replace'][0]) != list and
                type(kwargs['replace'][0]) != str ):
            raise TypeError("{}: replace value should be {} or {}"
                    .format(f.__name__,"list(tuple)","tuple(string,string)"))
        elif ( 'replace' in kwargs and 
                len(kwargs['replace']) > 0 and
                type(kwargs['replace'][0]) == str 
                and len(kwargs['replace']) < 2 ):
            raise TypeError("{}: replace value should be {} or {}"
                    .format(f.__name__,"list(string,string)","tuple(string,string)"))
        elif ( 'replace' in kwargs and 
                len(kwargs['replace']) > 0 and
                type(kwargs['replace'][0]) != str 
                and len(kwargs['replace'][0]) < 2 ):
            raise TypeError("{}: replace value should be {} or {}"
                    .format(f.__name__,"list(list(string,string))","list(tuple(string,string))"))

        if ( 'replace' in kwargs and 
            len(kwargs['replace']) > 0 and 
            type(kwargs['replace'][0]) == str  ):
            kwargs['replace'] = [(kwargs['replace'][0],kwargs['replace'][1])]
        
        import os.path
        if(os.path.isfile(args[0])):
            with open(args[0]) as arq_open:
                args = (arq_open.read(),)
        return f(*args, **kwargs)
    new_f.__name__ = f.__name__
    return new_f

@check_types
def parse(str_in, replace=None):
    try:
        if replace is not None:
            import re
            for r_val in replace:
                str_in = re.sub(r_val[0],r_val[1],str_in)
        import json
        result = json.loads(hiveparser_c.parse(str_in))
        if (type(result) == dict and
            'stmt_list' in result):
            return result['stmt_list']
        else:
            return []
    except Exception as ex:
        print(ex)
        return []
#python setup.py sdist bdist_wheel