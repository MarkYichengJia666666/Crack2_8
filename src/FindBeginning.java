/**
 * Created by jiayicheng on 17/7/26.
 */
public class FindBeginning {
    class node{
        int data;
        node next;
        public node(int d)
        {
            data=d;
        }
        void appendToTail(int d)
        {
            node end=new node(d);
            node n=this;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=end;
        }
    }

    node Find(node head)
    {

        if(head==null) return null;

        node slow=head;
        node fast=head;

        while(fast!=null&&fast.next!=null)
        {
         slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)
                break;
        }

        fast=head;
        while(fast!=slow)
        {
         slow=slow.next;
            fast=fast.next;
        }
        return fast;
    }
}
