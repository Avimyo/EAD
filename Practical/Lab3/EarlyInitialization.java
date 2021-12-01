public class EarlyInitialization
{
  private static final EarlyInitialization instance = new EarlyInitialization();
 
  private EarlyInitialization()
  {
    // private constructor
  }
  public static EarlyInitialization getInstance(){
        return instance;
    }
}