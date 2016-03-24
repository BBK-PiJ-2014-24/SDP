package qu12_Composite;

public class HtmlParentElement extends HtmlTag {
    
	private String tag;
	private String endTag;
	
	public HtmlParentElement(String tag){
		this.tag = tag;
		this.endTag = "/"+this.tag;
	}
	
	@Override
    public String getTagName() {
        return this.tag;
    }

    @Override
    public void setStartTag(String tag) {
    	this.tag = tag;
    }

    @Override
    public void setEndTag(String tag) {
    	this.endTag = tag; 
    }

    @Override
    public void generateHtml() {
    	System.out.println(this.tag);
    	for(HtmlTag h : super.childList){
    		h.generateHtml();
    	}
    	System.out.println(this.endTag);
    }
}