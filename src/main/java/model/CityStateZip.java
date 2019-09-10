package model;

import lombok.Data;

@Data
public class CityStateZip
    {
    private int CityStateZip_ID = 0;
    private String cityName_str;
    private String state_str;
    private String stateAbbr_str;		// State Abbreviation
    private String zipCode_str;
    private String county_str;

    public static void main(String[] args)
        {
        }


    /* -------------------------------- Getters & Setters  -------------------------------- */

    // Lombok handles this via annotation @Data
    /*
    @Data is a convenient shortcut annotation that bundles the features of @ToString, @EqualsAndHashCode,
    @Getter / @Setter and @RequiredArgsConstructor together: In other words, @Data generates all the boilerplate
    that is normally associated with simple POJOs (Plain Old Java Objects) and beans: getters for all fields,
    setters for all non-final fields, and appropriate toString, equals and hashCode implementations that involve
    the fields of the class, and a constructor that initializes all final fields, as well as all non-final fields
    with no initializer that have been marked with @NonNull, in order to ensure the field is never null.
     */
    /* ------------------------------ End Getters & Setters  ------------------------------ */

    }
