import axios from 'axios';
import { createAsyncThunk } from '@reduxjs/toolkit';
import { createSlice } from "@reduxjs/toolkit";
import { IArticle } from '../model/article';
import { initialState } from './article-init';
import { findAllArticles, findArticleById, findMyList } from './article-service';

const articleThunks = [findAllArticles]


const status = {
    pending: 'pending',
    fulfilled: 'fulfilled',
    rejected: 'rejected'
}


export const articleSlice = createSlice({
    name: "article",
    initialState,
    reducers: {},
    extraReducers: builder => {
        const { pending, rejected } = status;

        builder
            .addCase(findAllArticles.fulfilled, (state: any, { payload }: any) => {
                state.array = payload
            })
            .addCase(findArticleById.fulfilled, (state: any, { payload }: any) => {
                state.array = payload;
            })
            .addCase(findMyList.fulfilled, (state: any, { payload }: any) => { state.array = payload });
    },
})
export const getAllArticles = (state: any) => (state.article.array)
export const getArticleById = (state: any) => (state.article.array)
export const { } = articleSlice.actions

export default articleSlice.reducer;