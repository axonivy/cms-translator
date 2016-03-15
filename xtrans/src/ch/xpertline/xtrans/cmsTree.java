package ch.xpertline.xtrans;

import ch.ivyteam.ivy.cm.CoType;
import ch.ivyteam.ivy.cm.IContentObject;
import ch.ivyteam.ivy.persistence.PersistencyException;
import ch.ivyteam.ivy.scripting.objects.*;


public class cmsTree {
	
	private static Tree main;

	public cmsTree() {
		// Noting
	}
	
	public cmsTree(java.util.List<IContentObject> _coList) throws PersistencyException{
		generateTree(_coList);
	}
	
	public void setData(java.util.List<IContentObject> _coList) throws PersistencyException{
		generateTree(_coList);
	}
	
	public Tree getTree(){
		return main;
	}
	
	private void generateTree(java.util.List<IContentObject> _coList) throws PersistencyException{
		main = new Tree("cms");
		for (int i = 0; i < _coList.size(); i++){
			if(_coList.get(i).getContentObjectType().getCoType() == CoType.FOLDER){
				Tree sub = new Tree(_coList.get(i).getName());
				sub.addAll(addSubTree(_coList.get(i)));
				main.add(sub);
			}
		}
	}
	
	private List<Tree> addSubTree(IContentObject _co) throws PersistencyException{
		List<Tree> trees = List.create(Tree.class);
		for (int j = 0; j < _co.getChildren().size(); j++){
			if(_co.getChildren().get(j).getContentObjectType().getCoType() == CoType.FOLDER){
				Tree sub = new Tree(_co.getChildren().get(j).getName());
				List<Tree> childs = addSubTree(_co.getChildren().get(j));
				if (childs.size() > 0 && !childs.isEmpty()){
					sub.addAll(childs);
				}
				trees.add(sub);
			}
		}
		return trees;
	}
}
