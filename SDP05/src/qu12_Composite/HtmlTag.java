package qu12_Composite;

import java.util.ArrayList;
import java.util.List;

public abstract class HtmlTag {

	protected String tagBody;
	protected List<HtmlTag> childList = new ArrayList<HtmlTag>();
		
	public abstract String getTagName();

    public abstract void setStartTag(String tag);

    public abstract void setEndTag(String tag);

    public void setTagBody(String tagBody) {
        this.tagBody = tagBody;
    }

    public void addChildTag(HtmlTag htmlTag) {
    	this.childList.add(htmlTag);
    }

    public void removeChildTag(HtmlTag htmlTag) {
    	this.childList.remove(htmlTag);
    }

    public List<HtmlTag> getChildren() {
        return this.childList;
    }

    public abstract void generateHtml();
}