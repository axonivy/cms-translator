package ch.xpertline.xtrans;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import ch.ivyteam.ivy.cm.CoType;

public class Constants {
	public final static List<CoType> EDITABLE_CONTENT_TYPES = Collections.unmodifiableList(Arrays.asList(
					CoType.TEXT, CoType.STRING, CoType.PLAIN_TEXT));
}
