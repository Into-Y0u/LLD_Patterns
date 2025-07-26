We have:

5 countries
5 features, where:
3 features have 3 subfeatures
2 features have 4 subfeatures

The first two subfeatures of any feature are its MVP (Minimum Viable Product)
A feature is considered "live" in a country only if both MVP subfeatures are live
A subfeature is "live" in a country if it's implemented

The task:
Represent this data: which subfeatures and features are live per country

Calculate:
Feature-level parity score = (Number of live features / Total number of features) × 100
Subfeature-level parity score = (Number of live subfeatures / Total number of subfeatures) × 100


emphasize more on LLD and HLD rather than the DSA itself, the solution should be extensible for large number of country , feature and subfeature changing any time