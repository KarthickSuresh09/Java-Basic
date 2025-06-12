package day_11_abstaraction;

interface tree{
	public String treetype(String treetype);
}
interface branches{
	public int branchescount(int branchescount);
}
interface root{
	public int rootdepth(int rootdepth);
}


public class stem implements tree,branches,root{
public String treetype(String treetype) {
	return treetype;
}
public int branchescount(int branchescount) {
	return   branchescount;
}
public int rootdepth(int rootdepth) {
	return rootdepth;
}
}
