package qu12_Composite;

public class HtmlElement extends HtmlTag {
    
	private String tag;
	private String endTag;
	
	public HtmlElement(String tag){
		this.tag = tag;
		this.endTag = "/" + tag;
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
    	System.out.println(this.tagBody);
    	System.out.println(this.endTag);
    }
}