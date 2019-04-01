package practico1;

public class NodoInt {
	private int num;
	private NodoInt next;
	
	public NodoInt() {
		setNum(0);
		setNext(null);
	}
	
	public NodoInt(int x, NodoInt n) {
		setNum(x);
		setNext(n);
	}
	
	public void setNum(int x) {
		this.num = x;
	}
	
	public void setNext(NodoInt n) {
		this.next = n;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public NodoInt getNext() {
		return this.next;
	}
}
