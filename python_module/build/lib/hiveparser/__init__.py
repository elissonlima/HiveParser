import sys
import pathlib

sys.path.append(str(pathlib.Path(__file__).parent.absolute()))
import hiveparser_c

del pathlib
del sys

def parse(str_in):

    if type(str_in) is not str:
        raise TypeError("Input must be str type")

    import json
    try:
        result = json.loads(hiveparser_c.parse(str_in))
        return result['stmt_list']
    except Exception as ex:
        print(ex)
        return dict()