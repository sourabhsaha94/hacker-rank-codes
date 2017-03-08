/*Given a base-10 integer,n, convert it to binary (base-2). 
Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.
*/
function main() {
    var n = parseInt(readLine());
    var count=0;
    var numCount=1;
    var loopCount=0;
    
    while(n>0){
        if(n%2==1){
            loopCount++;
        }
        else{
            loopCount=0;
        }
        
        if(loopCount>1){
            if(loopCount>numCount){
                numCount=loopCount;
            }
        }
        n=Math.floor(n/2);
    }
    console.log(numCount);
}
