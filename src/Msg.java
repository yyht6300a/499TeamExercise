public class Msg implements Comparable<Msg>{
    private String content;

    private double num;

    public Msg(String text,double num){
        this.content=text;
        this.num=num;
    }
    public Msg(){

    }
    public int compareTo(Msg other){
        return (int)(this.num-other.num);
    }
    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public double getTime() {
        return this.num;
    }
    public void setTime(double num) {
        this.num= num;
    }
    public String toString(){
        return "Msg{"+"Content="+content+
                ",Number='"+num+'\''+'}'+"\n";
    }
	
}
