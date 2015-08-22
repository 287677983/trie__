
public class Trietree {
	
	public static void main(String[] args) {
		Trie tree =  new Trie();
		tree.insert("abc");
		tree.insert("bcd");
		tree.query("abc");
		tree.query("bcd");
	}
}


class node{
	boolean flag = false;//是否为字符串结尾
	node[] next = new node[26];//下一个节点
	char word;//保存字符
}

class Trie{
	
	public node root;
	public node node;
	public node head;
	public Trie(){
		root = new node();
	}
	
	//构造trie 树
	public void insert(String str){
		head = root;
		int size = str.length();
		for(int i = 0; i < size; i++){
			char s = str.charAt(i);
			int num = s - 'a';
			if(head.next[num] == null)
				head.next[num] = new node();
			if(head.next[num].word != str.charAt(i)){
				node = new node();
				node.word = str.charAt(i);
				head.next[num] = node;
			}
			head = head.next[num];
		}
		head.flag = true;
	}
	
	//查询
	public void query(String str){
		head = root;
		int size = str.length();
		for(int i = 0; i < size; i++){
			char s = str.charAt(i);
			int num = s - 'a';
			if(head.next[num].word == str.charAt(i)){
				head = head.next[num];
			}else
				break;
		}
		if(head.flag)
			System.out.println("ok");
		else
			System.out.println("erro");
	}
	
	public void delete(String str){
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}