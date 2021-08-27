class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
int ans[]=new int[n];
Stack<Integer>st=new Stack<>();
for(int i=0;i<n;i++)
{
if(st.isEmpty() || temperatures[st.peek()]>=temperatures[i])
{
st.push(i);
}
else
{
int x=st.pop();
ans[x]=i-x;
i--;
}
}
return ans;
    }
}
