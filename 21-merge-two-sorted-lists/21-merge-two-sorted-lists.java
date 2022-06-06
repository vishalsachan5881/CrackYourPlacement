class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	
		//make a node temp and initialise it with 0
        ListNode temp = new ListNode(0);
        var curr1 = list1;
        var curr2 = list2;
        var temp_node = temp;
		
		//itterate the loop while pointer to list1 reaches null or the pointer to list2 reaches null
        while(curr1 != null && curr2 != null){
		
			//check if the current node of list1 is smaller than current node of list2
			//if yes then point the next of temp node to the current node of list2 and move to the next current node of list2
            if(curr1.val <= curr2.val){
                temp_node.next = curr1;
                curr1 = curr1.next;
            }
            else{
                temp_node.next = curr2;
                curr2 = curr2.next;
            }
			
			//move the temp node to next node
            temp_node = temp_node.next;
        }
		
        //condition if one list is smaller than the other
		//so the current pointer of the smaller list will reach null sooner and the list will exhaust
        if(curr1 == null) temp_node.next = curr2;
        else temp_node.next = curr1;
        return temp.next;
    }
}