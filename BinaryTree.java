package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	private static Node root;
	public static void main(String[] args) {
		for(int i=1;i<10;i++){
			add(i);
		}
		display2(root);
		Node node=find(root,3);
		System.out.println("node为："+node.value);
		System.out.println("节点个数为："+getNodeNum(root));
	}
	public static void add(int value){
		
		if(root==null){
			root=new Node(value);
			
		}else{
			Node m=new Node(value);
			Node head=root;
			Node t=root;
			while(head!=null){
				t=head;
				if(value<head.value){
					head=head.left;
				}else{
					head=head.right;
				}
			}
			if(value<t.value){
				t.left=m;
			}else{
				t.right=m;
			}
		}
	}
	/*
	 * 中序遍历*/
	public static void display(Node r){
		if(r!=null){
			display(r.left);
			System.out.println(r.value);
			display(r.right);
		}
	}
	/*
	 * 先序遍历*/
	public static void display3(Node r){
		if(r!=null){
			System.out.println(r.value);
			display(r.left);
			display(r.right);
		}
	}
	/*
	 * 后序遍历*/
	public static void display4(Node r){
		if(r!=null){
			display(r.left);
			display(r.right);
			System.out.println(r.value);
		}
	}
	/*
	 * 按层遍历*/
	public static void display2(Node r){
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(r);
		while(!queue.isEmpty()){
			Node node=queue.poll();
			System.out.println(node.value);
			if(node.left!=null){
				queue.add(node.left);
				
			}
			if(node.right!=null){
				queue.add(node.right);
			}
		}
		
	}
	
	/*
	 * 二叉查找*/
	public static Node find(Node r,int value){
		if(r!=null){
			if(r.value==value){
				return r;
			}else{
				Node node1= find(r.left,value);
			    Node node2=find(r.right,value);
			    if(node1!=null){
			    	return node1;
			    }else{
			    	return node2;
			    }
			}
		}else{
			return null;
		}
		
	}
	/*
	 * 得到节点个数*/
	public static int getNodeNum(Node r){
		if(r==null){
			return 0;
		}else{
			int num1=getNodeNum(r.left);
			int num2=getNodeNum(r.right);
			return num1>num2?(num1+1):(num2+1);
		}
		
		
	}
	
	/*
	 * 私有静态内部类*/
	private static class Node{
		protected int value;
		public Node(int value) {
			super();
			this.value = value;
		}
		protected Node left=null;
		protected Node right=null;
	}
}
