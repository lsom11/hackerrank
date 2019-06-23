class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Queue:
    def __init__(self):
        self.stack = []

    def peek(self):
        return self.stack[-1]

    def isEmpty(self):
        return not len(self.stack)

    def add(self, val):
        self.stack.append(val)

    def remove(self):
        return self.stack.pop(0)
