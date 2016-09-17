package 自定义循环队列;
/**
 * (rear+1)%array.length==font时队满
 *  rear==font时队空
 * */
public class QueueArray {
	private Object [] array;
	private int font;
	private int rear;
	public static void main(String[] args) {
		 QueueArray q = new QueueArray(4);     
	        System.out.println(q.enqueue("张三"));     
	        System.out.println(q.enqueue("李斯"));     
	        System.out.println(q.enqueue("赵五"));     
	        System.out.println(q.enqueue("王一"));//无法入队列，队列满     
	        for(int i=0;i<4;i++){     
	            System.out.println(q.dequeue());     
	        }     
	}
	public QueueArray(){
		this(10);
	}
	public QueueArray(int size){
		array=new Object[size];
		font=0;
		rear=0;
	}
	public boolean enqueue(Object obj){
		if((rear+1)%array.length==font){
			return false;
		}
		array[rear]=obj;
		rear=(rear+1)%array.length;
		return true;
	}
	
	public Object dequeue(){
		if(rear==font){
			return null;
		}
		Object o=array[font];
		font=(font+1)%array.length;
		return o;
	}
	
	
	
	
	
}
