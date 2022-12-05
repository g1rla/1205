package ru.levelup.universities.service;

import ru.levelup.universities.domain.University;
import ru.levelup.universities.io.FileIO;
import ru.levelup.universities.service.mapper.UniversityMapper;

import java.util.ArrayList;
import java.util.List;

public class FileUniversityService implements UniversityService {
    // class dependencies
    private final FileIO fileIO;
    private final UniversityMapper universityMapper;

    public  FileUniversityService() {
        this.fileIO = new FileIO();
        this.universityMapper = new UniversityMapper();

    }

    @Override
    public List<University> getAll() {
        // read file
        List<String> lines = fileIO.readFileLines("universities.txt");
        List<University> universities = new ArrayList<>();

        // Transform each line to University object
        for (String line: lines) {
            University u = universityMapper.map(line);
            universities.add(u);
        }
        return null;
    }
}
