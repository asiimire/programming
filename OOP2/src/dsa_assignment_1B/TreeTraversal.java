package dsa_assignment_1B;

public class TreeTraversal {
    public static void main(String[] args) {
        Node data = createData();
        //preOrder(data);
        //postOrder(data);
        inOrder(data);
    }

    public static void preOrder(Node n){
        if(n == null)
            return;
        System.out.print(n.value+" "); //print before
        preOrder(n.left);
        preOrder(n.right);

    }

    public static void postOrder(Node n){
        if(n == null)
            return;
        postOrder(n.left);
        postOrder(n.right);
        System.out.print(n.value+" "); //print after
    }

    public static void inOrder(Node n){
        if(n == null)
            return;
        inOrder(n.left);
        System.out.print(n.value+" "); //print in-between
        inOrder(n.right);
    }

    public static Node createData(){
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        Node g = new Node("g");

        a.left = b;
        a.right = g;
        b.left = c;
        b.right = d;
        c.left = e;
        e.right = f;

        return a;
    }
    
}
