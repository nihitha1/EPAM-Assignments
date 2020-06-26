public class Cost 
{
	float totcost;
	public void SelectChoice(String m_std,int area,boolean ch)
	{
		if (m_std=="standardmaterials") 
                {
			totcost=1200*area;
			System.out.format("Total cost: %f ",totcost);
		}
		if (m_std=="abovestandardmaterials")
   		{
			totcost=1500*area;
			System.out.format("Total cost: %f ",totcost);
		}
		if (m_std=="highstandardmaterials" && ch==false)
		{
			totcost=1800*area;
			System.out.format("Total cost: %f ",totcost);
		}
		if (m_std=="highstandardmaterials" && ch==true) 
		{
			totcost=2500*area;
			System.out.format("Total cost: %f ",totcost);
		}
		
	}
	
}