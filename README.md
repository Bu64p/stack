# stack

In computer science, a stack is an abstract data type that serves as a collection of elements, with two main principal operations:
- Push: which adds an element to the collection, and
- Pop: which removes the most recently added element that was not yet removed.

The order in which elements come off a stack gives rise to its alternative name, LIFO (last in, first out). Additionally, a peek operation may give access to the top without modifying the stack. The name "stack" for this type of structure comes from the analogy to a set of physical items stacked on top of each other. This structure makes it easy to take an item off the top of the stack, while getting to an item deeper in the stack may require taking off multiple other items first.

*Similar to a stack of plates, adding or removing is only possible at the top.*

[wikipedia](https://en.wikipedia.org/wiki/Stack_(abstract_data_type))

#  Methods:

| Command | Description |
| ---------- | --------- |
| `stack() : void` | create a stack |
| `push(Object value) : void` | insert ```value``` to stack |
| `pop() : Object` | delete the top node and return its value |
| `getTop() : Object` | get the value of the item on top of the stack |
| `getSize() : int` | get the size of stack|
> if stack is empty and use pop() method, you will get an exception.
#  
 compiled in Java16. 

    
    
    

#
<b><i>Code and Design By Eng.Parsa Gh (Bu64p)</b></i>
