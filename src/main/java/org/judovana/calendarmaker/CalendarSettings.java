package org.judovana.calendarmaker;

import java.util.List;

public class CalendarSettings {

private String namesFile; //file with "dateTABnames or titles" default is ~/.config/default null==disabled
    private String template; //HoRIZONTAL or VERTICAL or file or values? (hard to image how user create thois file)
    private boolean moon; //for now only true
    private String interestingNames; //file with name per line
    private String interestingDates ; //file with dd,mm.(yyyy)tabEVENTtabOPTIONALWEBCOLOR
    private boolean week; //weeK or month? FLSE,MONT IS default
    private List<String> images;

}
