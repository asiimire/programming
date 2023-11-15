class Node:
    """
    An object for storing a single node of a linked list
    Models two attributes - data and the link to the next node in the list
    """
    data = None #hold data stored
    next_node = None #point to the next node
    
    def __init__(self, data):
        self.data = data
        
    def __repr__(self) -> str:
        return "<Node data: %s>"%self.data
    
class LinkedList:
    """Singly linked list
    """
    def __init__(self):
        self.head = None
        
    def is_empty(self):
        return self.head == None
    
    def size(self):
        """Takes:
            O(n) linear time
        Returns:
            number of nodes in the list
        """
        current = self.head
        count = 0
        
        while current:
            count += 1
            current = current.next_node
        
        return count
    
    """def add(self,data):
        """#_summary_
    #Adds a new Node containing data at head of the list
        #Takes:
            #O(1) constant time
        """
        new_node = Node
        new_node.next_node = self.head
        self.head = new_node
    
    def __repr__(self):
        """
        #Return a string representation of the list
       # Takes O(n) linear time
        """
        nodes = []
        current = self.head
        
        while current:
            if current is self.head:
                nodes.append("[Head: %s]" % current.data)
            elif current.next_node is None:
                nodes.append("[Tail: %s]" % current.data)
            else:
                nodes.append("[%s]" % current.data)
                
            current = current.next_node
        return '-> '.join(nodes)
"""
l = LinkedList()
l.add(1)
l.add(2)
l.add(3)

print(l)