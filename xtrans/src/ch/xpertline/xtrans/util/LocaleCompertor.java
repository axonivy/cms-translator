package ch.xpertline.xtrans.util;

import java.util.Locale;

public class LocaleCompertor implements java.util.Comparator<Locale>{
	
	public LocaleCompertor(){
		// igonre this
	}
	
	@Override
	public int compare(Locale lang1, Locale lang2) {
		int r = 0;
		r = lang1.getDisplayLanguage().compareTo(lang2.getDisplayLanguage());
		if (r == 0){
			r = lang1.getDisplayCountry().compareTo(lang2.getDisplayCountry());
		}
		return r;
	}
}
