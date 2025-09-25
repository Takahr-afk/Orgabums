package com.jannikscode.orgabums;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.text.DateFormat;
import java.util.HashMap;

@Builder
@Getter
@Setter
public class Case {
    final private String caseName;
    final private String caseId;
    final private String ksd_partner;
    final private String ksd_Section;
    final private String start_date;
    final private String end_date;
    final private Boolean child_endangerment;
    // Key Role, Value Name
    final private HashMap<String, String> family;
    private HashMap<String, String> contact_info;
    // Key UserID, Value Name
    final private HashMap<String, String> professionals;
    // Key Date, Value Meeting
    private HashMap<DateFormat, Meeting> meetings;
}
