import java.util.HashMap;
    /**
     * Displays percentage of votes each president has, 
     * based on the values in the votes HashMap.
     * @author Mia Dia
     */
    public class PercentageDisplay implements Observer{
      private Subject poll;
      private HashMap<String, Integer> votes;
      private int numVotes = 0;
      /**
       * Creates a new Tally Display
       * @param poll Subject object that holds the poll data
       */
      public PercentageDisplay(Subject poll) {
        this.poll = poll;
        this.poll.registerObserver(this);
      }
    
      /**
       * Update the current votes
       * @param Votes: a HashMap representing all the votes
       */
      public void update(HashMap<String, Integer> votes) {
        this.votes = votes;
        //add all votes
        this.numVotes = 0;
        for (String key : this.votes.keySet()) {
          this.numVotes += this.votes.get(key);
        }
        //print
        display();
      }
    
      /**
      * Prints out all percentage of votes with corresponding president
      */
      private void display() {
        for (String key : this.votes.keySet()) {
            double percentage = this.votes.get(key);
            percentage /= this.numVotes;
            percentage *= 1000;
            percentage = Math.round(percentage);
            percentage /= 10;
            System.out.println(key + ": " + percentage + "%");
          }
        System.out.println();
      }
    }
    