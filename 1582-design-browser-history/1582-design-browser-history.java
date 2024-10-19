class Node {
    String url;
    Node prev;
    Node next;

    public Node(String url){
        this.url=url;
        this.next=null;
        this.prev=null;
    }
}
class BrowserHistory {
    Node curr;

    public BrowserHistory(String homepage) {
        curr = new Node(homepage);
        
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        curr.next=newNode;
        newNode.prev=curr;

        curr=newNode;
    }
    
    public String back(int steps) {

        int i=1;
        while(i<=steps && curr.prev!=null){
            curr=curr.prev;
            i++;
        }

        return curr.url;
        
    }
    
    public String forward(int steps) {
        
        int i=1;
        while(i<=steps && curr.next!=null){
            curr=curr.next;
            i++;
        }

        return curr.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */