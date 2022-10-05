import ast

class Node(object):
    def __init__(self, data):
        self.data = data
        self.child = {}
        self.last = False


class Trie:

    def __init__(self):
        self.head = Node(None)

    def insert(self, word: str) -> None:
        cur_data = self.head

        for _word in word:
            if _word not in cur_data.child:
                cur_data.child[_word] = Node(_word)
            cur_data = cur_data.child[_word]

        cur_data.data = word
        cur_data.last = True

    def search(self, word: str) -> bool:
        return_bool_result = True
        cur_data = self.head

        for _word in word:
            if _word in cur_data.child:
                cur_data = cur_data.child[_word]
            else:
                return_bool_result = False
                break

        if cur_data.last is False or cur_data is None:
            return_bool_result = False

        return return_bool_result

    def startsWith(self, prefix: str) -> bool:
        return_bool_result = True
        cur_data = self.head

        for _prefix in prefix:
            if _prefix in cur_data.child:
                cur_data = cur_data.child[_prefix]
            else:
                return_bool_result = False
                break

        return return_bool_result

# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.search(word)
# param_3 = obj.startsWith(prefix)

command_input = ast.literal_eval(input())
input_value = ast.literal_eval(input())

return_answer = list()

for i in range(len(command_input)):
    return_val = None

    if command_input[i] == "Trie":
        obj = Trie()
    elif command_input[i] == "insert":
        obj.insert(input_value[i][0])
    elif command_input[i] == "search":
        return_val = obj.search(input_value[i][0])
    elif command_input[i] == "startsWith":
        return_val = obj.startsWith(input_value[i][0])

    return_answer.append(return_val)

print(return_answer)

