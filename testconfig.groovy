

conf {
    //defaults
    glue = "com.netaporter.cucumber.steps " +
            "com.netaporter.test.utils.cucumber.glue"
    //don't forget to leave a space between values when concatenating!!!!
    path = "classpath:com/netaporter/cucumber/features"
}
// Environment names should be lowercase, field values concatenated
environments {
    sanity{
        conf {
            tags = "@Sanity "+
                   "~@known-failure"
        }
    }

    insanity{
        conf {
            tags = "@Sanity " +
                   "@known-failure"
        }
    }
    mrpall{
        conf{
            path="classpath:com/netaporter/cucumber/features/mrp"
            tags = "~@known-failure"
        }
    }

}