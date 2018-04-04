void draw() {
}
void setup() {
  background(200);
  size(500, 500);
  
  int count = 0;
  for (int i = 250; i > 31; i-=30) {
    count+=1;
    if (count%2 == 0) {
      fill(255, 0, 0);
    }
    
     else{
       fill(255, 255, 255);
     }
      ellipse(250, 250, i, i);
  }
 
  
}