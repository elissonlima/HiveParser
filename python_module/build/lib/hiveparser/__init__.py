import sys
import pathlib

sys.path.append(str(pathlib.Path(__file__).parent.absolute()))
import hiveparser_c

del pathlib
del sys

def parse(str_in):
    import json
    return json.loads(hiveparser_c.parse(str_in))