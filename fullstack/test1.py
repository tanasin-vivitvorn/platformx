import unittest

def print_depth(data):
    # Write function body
    result = {}
    find_depth(data=data, result=result)
    for the_key, the_value in sorted(result.items()):
        print the_key,the_value
    return result

def find_depth(data, depth=1, result={}):
    for the_key, the_value in sorted(data.items()):
        result[the_key] = depth
        if isinstance(the_value, dict):
            mydepth = depth + 1
            find_depth(data=the_value, depth=mydepth, result=result)

class TestDepth(unittest.TestCase):
    def test(self):
        a = { "key1": 1, "key2": { "key3": 1, "key4": { "key5": 4 } } }
        result = print_depth(data=a)
        self.assertEqual(result["key1"], 1)
        self.assertEqual(result["key2"], 1)
        self.assertEqual(result["key3"], 2)
        self.assertEqual(result["key4"], 2)
        self.assertEqual(result["key5"], 3)

if __name__ == '__main__':
    unittest.main()