import sys
import pathlib

sys.path.append(str(pathlib.Path(__file__).parent.absolute()))
import hiveparser_c

del pathlib
del sys

def parse(str_in):
    import json
    try:
        result = json.loads(hiveparser_c.parse(str_in))
        return result
    except Exception as ex:
        print(ex)
        return dict()