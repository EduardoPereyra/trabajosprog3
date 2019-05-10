package practico2;

public class TNode {
	private TNode left;
	private TNode right;
	private int n;
	
	public TNode(int n) {
		this.n = n;
	}
	
	public int getN() {
		return this.n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public TNode getLeft() {
		return left;
	}

	public void setLeft(TNode left) {
		this.left = left;
	}

	public TNode getRight() {
		return right;
	}

	public void setRight(TNode right) {
		this.right = right;
	}

/*	
	public boolean hasElem(int n) {
		if(this.n == n) {
			return true;
		}else {
			if(this.left != null){
				if(this.n > n) {
					return this.left.hasElem(n);
				}else {			
					if(this.right != null) {
						return this.right.hasElem(n);
					}
				}
			}
		}
		return false;
	}
*/
	
	public void imprimir() {
		if(this.left != null) {
			this.left.imprimir();
		}else {
			System.out.println("left");
		}
		System.out.println(this.n);
		if(this.right != null) {
			this.right.imprimir();	
		}else {
			System.out.println("right");
		}
	}
/*	
	public boolean delete(int n) {
		if(this.n > n) {
			if(this.left.getN() == n) {
				return this.deleteNode(n,this.left);
			}else {
				return this.left.delete(n);
			}
		}else {
			if(this.right.getN() == n) {
				return this.deleteNode(n,this.right);
			}else {
				return this.right.delete(n);
			}
		}
	}
*/
/*	
	private boolean deleteNode(int n ,TNode nodohijo) { //incompleto
		if(nodohijo.isHoja()) {
			if(this.left.getN() == n) {
				this.left = null;
			}else {
				this.right = null;
			}
			return true;
		}else if(nodohijo.unHijo()) {
			if(this.left.getN() == n) {
				this.left = nodohijo.left;
			}else {
				this.right = nodohijo.right;						
			}
			return true;
		}else if(nodohijo.dosHijos()) {
			if(this.left.getN() == n) {
				
				
				
			}else {
				
				
				
			}
			return true;
		}
		return false;
	}
*/	
/*	
	public ArrayList<Integer> getElemAtLevel(ArrayList<Integer> lista, int i) {
		if(i == 1) {
			lista.add(this.getN());
		}else {
			if(this.left != null) {
				this.left.getElemAtLevel(lista,i-1);	
			}
			if(this.right !=null) {
				this.right.getElemAtLevel(lista,i-1);	
			}
		}
		return lista;
	}
*/	
	public boolean isHoja() {
		if((this.left == null)&&(this.right == null)){
			return true;
		}
		return false;
	}
/*	
	private boolean dosHijos() {
		if((this.left != null)&&(this.right != null)){
			return true;
		}
		return false;		
	}
	
	private boolean unHijo() {
		if((this.left != null)||(this.right != null)){
			return true;
		}
		return false;	
	}
*/
}
