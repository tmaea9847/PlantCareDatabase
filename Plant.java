package plantCareInfo;

public class Plant {
		private int id;
		
		// General Plant Info:
		private String name;
		private String latinName;
		private String plantSpecOrigin;
		private String plantFamily;
		private String ratingForHomeGrowth;
	    private String propagationMethod;
		
		// Plant Care Info:
		private String careInstructions;
		private String lightRequirements;
		private String wateringSchedule;
		private String soilRequirements;
		
	    public Plant(int id, 
	    		String name, String latinName, String plantSpecOrigin, String plantFamily, String ratingForHomeGrowth, String propagationMethod,
	    		String careInstructions, String lightRequirements, String wateringSchedule, String soilRequirements) 
	    {
	    	this.id = id;
	    	this.name = name;
	    	this.latinName = latinName;
	    	this.plantSpecOrigin = plantSpecOrigin;
	    	this.plantFamily = plantFamily;
	    	this.ratingForHomeGrowth = ratingForHomeGrowth;
	    	this.propagationMethod = propagationMethod;
	    	this.careInstructions = careInstructions;
	    	this.lightRequirements = lightRequirements;
	    	this.wateringSchedule = wateringSchedule;
	    	this.soilRequirements = soilRequirements;
	    } 
	    
	    // Getters
	    public int getId() { 
	        return id;
	    }
	    public String getName() {
	        return name;
	    }
	    public String getLatinName() { 
	        return latinName;
	    }
	    public String getPlantSpecOrigin() {
	        return plantSpecOrigin;
	    }
	    public String getPlantFamily() { 
	        return plantFamily;
	    }
	    public String getRatingForHomeGrowth() { 
	        return ratingForHomeGrowth;
	    }
	    public String getPropagationMethod() { 
	        return propagationMethod;
	    }
	    public String getCareInstructions() { 
	        return careInstructions;
	    }
	    public String getLightRequirements() { 
	        return lightRequirements;
	    }
	    public String getWateringSchedule() { 
	        return wateringSchedule;
	    }
	    public String getSoilRequirements() { 
	        return soilRequirements;
	    }

	    // End of Getters
	    
	    @Override
	    public String toString() {
	        return "Plant{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", latinName='" + latinName + '\'' +
	                ", plantSpecOrigin='" + plantSpecOrigin + '\'' +
	                ", plantFamily='" + plantFamily + '\'' +
	                ", ratingForHomeGrowth='" + ratingForHomeGrowth + '\'' +
                    ", propagationMethod='" + propagationMethod + '\'' +
	                ", careInstructions='" + careInstructions + '\'' +
	                ", lightRequirements='" + lightRequirements + '\'' +
	                ", wateringSchedule='" + wateringSchedule + '\'' +
	                ", soilRequirements='" + soilRequirements + '\'' +
	                '}';
	    } // End of override
	} // End of Plant Class