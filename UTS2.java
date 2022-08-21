public class UTS2 {
 int femi[]=new int[5];
 public void Indra(int value){
 if(femi[0]==0){
 femi[0]=value;
 System.out.println("Masuk "+femi[0]);
 }else if(femi[1]==0){
 femi[1]=value;
 System.out.println("Masuk "+femi[1]);
 }else if(femi[2]==0){
 femi[2]=value;
 System.out.println("Masuk "+femi[2]);
 }else if(femi[3]==0){
 femi[3]=value;
 System.out.println("Masuk "+femi[3]);
 }else{
 isIndra();
 }
 }
 public void isIndra(){
 System.out.println("Masuk Penuh");
 }
 public void Agung(){
 if(femi[0]!=0){
 System.out.println("Keluar "+femi[0]);
 femi[0]=0;
 }else if(femi[1]!=0){
 System.out.println("Keluar "+femi[1]);
 femi[1]=0;
 }else if(femi[2]!=0){
 System.out.println("Keluar "+femi[2]);
 femi[2]=0;
 }else if(femi[3]!=0){
 System.out.println("Keluar "+femi[3]);
 femi[3]=0;
 }else{
 isAgung();
 }
 }
 public void isAgung(){
 System.out.println("Masuk Kosong");
 }
 public void cetak(){
 System.out.println("-------------Print--------------");
 for(int i=0;i<femi.length;i++){
 if(femi[i]!=0){
 System.out.println(femi[i]+" ");
 }
 }
 System.out.println("--------------------------------");
 }
 public static void main(String[] args) {
 UTS2 s=new UTS2();
 s.Indra(5);
 s.Indra(3);
 s.Indra(2);
 s.Indra(6);
 s.Indra(7);
 s.cetak();
 s.Agung();
 s.Agung();
 s.cetak();
 }
}