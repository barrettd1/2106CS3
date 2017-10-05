//Danyelle Barrett
public class Insert
{
  static int comparison = 0;
   /**
   * Sort an array of integers from smallest to largest, using an insertion sort
   * algorithm.
   * @param data
   *   the array to be sorted
   * @param first
   *   the start index for the portion of the array that will be sorted
   * @param n
   *   the number of elements to sort
   * <b>Precondition:</b>
   *   <CODE>data[first]</CODE> through <CODE>data[first+n-1]</CODE> are valid
   *   parts of the array.
   * <b>Postcondition:</b>
   *   If <CODE>n</CODE> is zero or negative then no work is done. Otherwise, 
   *   the elements of <CODE>data</CODE> have been rearranged so that 
   *   <CODE>data[first] &lt;= data[first+1] &lt;= ... &lt;= data[first+n-1]</CODE>.
   * @exception ArrayIndexOutOfBoundsException
   *   Indicates that <CODE>first+n-1</CODE> is an index beyond the end of the
   *   array.
   * */
   public static int insertionsort(int[ ] data, int first, int n)
   {
      int entry;  // The element that is currently being inserted
      int j;
         
      for (int i = 1; i < n; i++)
      {
         entry = data[first+i];
         for (j = first+i; (j>first) && (data[j-1] > entry); j--) 
         {
                data[j] = data[j-1]; 
                comparison++;
         }
         comparison++;
         data[j] = entry;   
      }
      return comparison;
  }   
}

