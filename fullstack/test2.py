import unittest

class Person(object):
    def __init__(self, first_name, last_name, father):
        self.first_name = first_name
        self.last_name = last_name
        self.father = father

    def __iter__(self):
        yield ' first_name', self.first_name #The prefix space used for avoid key sorting problem
        yield ' last_name', self.last_name #The prefix space used for avoid key sorting problem
        yield 'father', self.father

def print_depth(data):
    # Write function body
    results = []
    find_depth(data=data, result=results)

    for result in results:
        print result

    return results

def find_depth(data, depth=1, result=[]):
    for the_key, the_value in sorted(data.items()):
        result.append(the_key.strip() + " " + str(depth))
        
        if isinstance(the_value, Person):
            the_value = dict(the_value)

        if isinstance(the_value, dict):
            mydepth = depth + 1
            find_depth(data=the_value, depth=mydepth, result=result)

class TestDepth(unittest.TestCase):
    def test(self):

        person_a = Person("User", "1", None)
        person_b = Person("User", "2", person_a)
        
        a = { "key1": 1, "key2": { "key3": 1, "key4": { "key5": 4, "user": person_b, } } }
        result = print_depth(data=a)
        self.assertEqual(result[0], "key1 1")
        self.assertEqual(result[1], "key2 1")
        self.assertEqual(result[2], "key3 2")
        self.assertEqual(result[3], "key4 2")
        self.assertEqual(result[4], "key5 3")
        self.assertEqual(result[5], "user 3")
        self.assertEqual(result[6], "first_name 4")
        self.assertEqual(result[7], "last_name 4")
        self.assertEqual(result[8], "father 4")
        self.assertEqual(result[9], "first_name 5")
        self.assertEqual(result[10], "last_name 5")
        self.assertEqual(result[11], "father 5")


if __name__ == '__main__':
    unittest.main()