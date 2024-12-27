
public class Main {

	public static void main(String[] args) {
        Node<Integer> p = new Node<>(1);
		 p.setNext(new Node<>(8));
	        p.getNext().setNext(new Node<>(3));
	        p.getNext().getNext().setNext(new Node<>(4));
	        p.getNext().getNext().getNext().setNext(new Node<>(8));
	        p.getNext().getNext().getNext().getNext().setNext(new Node<>(1));
	        p.getNext().getNext().getNext().getNext().getNext().setNext(new Node<>(4));
	        System.out.println(ex3(p));
	       System.out.println( p.toString());
	}
public static int ex3(Node<Integer> p) {
	int c=0;
	int c1=0;
while(p.getValue()!=8) {	
	if(p.getValue()!=8)
		c++;
	p=p.getNext();
	
}
while(p!=null) {
	if(p.getValue().equals(8)) {
		c1=0;
		p=p.getNext();
	}
	if(p!=null)
		c1++;
	p=p.getNext();
}
return c1+c;
}
}
