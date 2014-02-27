import java.util.ArrayList;
/**
 * Write a description of class "SchoolSubject" here.
 * 
 * @author     LTC_134_000
 * @version    30/01/2014 15:12:50
 */
public class SchoolSubject {

	/** Nom de la branche */
	private String name;
     /** liste des notes de la  branche */
	 

	/**
	 * Write a description of this constructor here.
	 * @param pName    a description of the parameter "pName"
	 * Saisie du nom de la branche
	 */
	public SchoolSubject(String pName)
	{
		name = pName;
	}

	/**
	 * Write a description of method "getName" here.
	 * @return                a description of the returned result
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Write a description of method "addMark" here.
	 * Ajout d'une note dans la liste des notes
	 */
	public void addMark(int pMark)
	{
		alMarks.add(pMark);
	}

	/**
	 * Write a description of method "calculateAverage" here.
	 * Calcul de la moyenne des notes dans la liste
	 * @return                a description of the returned result
	 */
	public double calculateAverage()
	{
		int sum = 0;
		for (int i=0 ; i<alMarks.size(); i++)
          {
          	sum = sum + alMarks.get(i);
          }
          return (double) sum / alMarks.size();
	}

	/**
	 * Write a description of method "calculateRoundedAverage" here.
	 * Calcul de la moyenne arrondie à l'unité supérieure
	 * @return                a description of the returned result
	 */
	public int calculateRoundedAverage()
	{
		double average = calculateAverage();
		if (average == (int) average)
		   return (int)average;
		else return (int) average +1;
		// ou bien: return (int) Math.ceil(calculateAverage());
		
		
	}

	/**
	 * Write a description of method "getBestMark" here.
	 * @return                a description of the returned result
	 */
	public int getBestMark()
	{
		if (alMarks.size() > 0)
		{
			int best = alMarks.get(0);
			for (int i=1 ; i<alMarks.size() ; i++)
			{
				if (alMarks.get(i) > best)
				{
				   best = alMarks.get(i);
				}
			}
			return best;
		}
		else return -1;
	}

	/**
	 * Write a description of method "getWorstMark" here.
	 * @return                a description of the returned result
	 */
	public int getWorstMark()
	{
		if (alMarks.size() > 0)
		{
			int worst = alMarks.get(0);
			for (int i=1 ; i<alMarks.size() ; i++)
			{
				if (alMarks.get(i) < worst)
				{
				   worst = alMarks.get(i);
				}
			}
			return worst;
		}
		else return -1;
	}

	public void clear()
	{
		alMarks.clear();
	}

	public Object[] toArray()
	{
		return alMarks.toArray();
	}
	
	public int getSize()
        {
                return alMarks.size();
        }
}
