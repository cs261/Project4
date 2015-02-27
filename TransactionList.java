import java.util.*;


public class TransactionList {
	private List<transaction> list;
	public TransactionList(){
		list = new ArrayList<transaction>();
	}
	public void add(transaction t){
		list.add(t);
	}
	public void listAll(){
		for(transaction t : list){
			t.print();
		}
	}
	public void search(String string){
		
		for(transaction t : list){
			String temp = t.getDescription();
			String lower = temp.toLowerCase();
			int i = lower.indexOf(string);
			if(i == -1){
				
			}
			else{
				t.print();
			}
			
		}
	}
	public void remove(String string){
		for(transaction t : list){
			String temp = t.getDescription();
			String lower = temp.toLowerCase();
			int i = lower.indexOf(string);
			if(i == -1){
				
			}
			else{
				list.remove(t);
				break;
			}
			
		}
	}	
	public void remove(int index){
		if(index >= 0 && index < list.size())
				list.remove(index);
		else
			System.out.println("invalid location");
	}	
}
