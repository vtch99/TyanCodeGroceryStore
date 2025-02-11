package com.tyan.ai.frame.enabler;

import java.util.LinkedHashMap;
import java.util.List;

import com.tyan.ai.frame.knowledge.KnowledgeModel;
import com.tyan.ai.frame.logic.LogicModel;

public class EnablerManager {
	
	public static LinkedHashMap<Integer, LogicModel> getAllLogicModel(List<KnowledgeModel> klgs){
		LinkedHashMap<Integer, LogicModel> marks = new LinkedHashMap<Integer, LogicModel>();
		for(int i=0; i<klgs.size(); i++){
			if(klgs.get(i).getLogic() != null)
				marks.put(i, klgs.get(i).getLogic());
		}
		return marks;
	}

}
