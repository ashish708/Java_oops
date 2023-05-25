package com.example.java.oops.collectionSorting;

public class CollectionSorting implements Comparable<CollectionSorting> {

	int id;
	String name;
	int rank;

	public CollectionSorting(int id, String name, int rank) {
		this.id = id;
		this.name = name;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "CollectionSorting [id=" + id + ", name=" + name + ", rank=" + rank + "]";
	}

	@Override
	public int compareTo(CollectionSorting s) {
//		return this.id - s.id ;
//		return this.name.compareTo(s.name);
		return this.rank - s.rank;
	}

}
