package com.mbouchenoire.competitive.programming.hashcode.qualification2017.model;

import java.util.Objects;

public class Video {

    public final int id;
    public final int size;

    public Video(int id, int size) {
        this.id = id;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return id == video.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", size=" + size +
                '}';
    }
}
