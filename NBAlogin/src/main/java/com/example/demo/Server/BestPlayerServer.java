package com.example.demo.Server;

import com.example.demo.Bean.BestPlayerReturn;

import java.util.List;

public interface BestPlayerServer {
    List<BestPlayerReturn> bstreturn();
    List<BestPlayerReturn> bstreturn(int id);
}
