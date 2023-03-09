Assignment 1 - Evelyn Chan 
// Q1) Write a function which determines if two nodes in a binary tree are cousins.
// Two nodes are considered cousins if they are on the same level and have different parents. 

// Q2) Write the pseudocode to find the lowest common ancestor of two nodes n1, n2 in a linked binary tree structure. 
// The lowest common ancestor is the lowest node in te tree that has both n1 and n2 as descendants. 

// Q3) The diameter D of a binary tree is defined as the umber of nodes on the longest path between any two nodes in the tree. 
// The path may pass through the root, but does not have to. For a given diameter, there may be more than one path which has the longest length.


// Q4) The split method for generating random binary trees splits the number of nodes n uniformly and assigns the number in the left split to the 
// left child and the number in the right split to the right child. The process continues until all nodes are used. 
// The code for the constructRandom(int n) method is below. 
// Use this function to create random binary trees of the folowing sizes. 
N = [10, 50, 100, 200, 500, 1000, 2000, 5000, 10000, 50000]
// For each size of tree, compute the average height and average diameter. You should find the average by generating 500 
// different random trees at each size. You should seed the random number generator wit your student number. 

public static void main(String [] args) {
    Random rnd = new Random(); 
    rnd.setSeed(2023....);// 22210544 
}
// a)Make a table that includes average height and average diameter 
// b)Make a plot of the average height and diameter against N
// c) Find O(N) complexity of the average height and average diameter with N

// Code listing for constructRandom 

public void constructRandom(int n) {
    if(!isEmpty()) return; 
    AtomicInteger key = AtomicInteger(0);
    root = randomTree(null, n, key); 
}

private Node<E> randomTree(Node<E> parent, Integer n, AtomicInteger key) {
    if (n ==0) return null;

    Integer leftCount = rnd.nextInt(n); //split number of nodes 
    Node<E> node = new Node<R>((E)((Integer) key.get()), parent, null, null);
    size++;

    key.getAndIncrement();
    node.left = randomTree(node, leftCount, key); 

    key.getAndIncrement();
    node.left = randomTree(node, n - leftCount - 1, key);
    return node; 
}