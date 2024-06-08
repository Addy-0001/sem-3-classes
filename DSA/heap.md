# Heap as a Data Structure
###  To remove an element from Max Heap
* Swap the last element with the first element. 
* Do (n = n-1) so that the last element is severed. 
* Restructure the heap so that it follows the rules of Max Heap. 
* If we try to look for the n+1 th child, it exceeds the valid element value. 


                50
              /   \
             40    30
            / \    / \
          10  20  15 25
          /
         6

After removal of root element, 50. 

                40
              /   \
             20    30
            / \    / \
          10  6   15 25
The heap must be a max heap otherwise this method will not work. 
      
### Implement priority queue using maximum and minimum heap.
